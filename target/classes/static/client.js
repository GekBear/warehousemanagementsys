(function() {
    const loadAssets = () => {
        LazyLoad.js(['/packages/vue@2/dist/vue.min.js','/packages/cloud-ui.vusion@0.18.17/dist-theme/index.js','/packages/lcap-pc-template@0.8.6/cloudAdminDesigner.umd.min.js','/packages/lcap-printPage@0.1.1/dist-theme/index.js','/packages/timer-count-down@0.1.4/dist-theme/index.js','/packages/countdown@0.1.1/dist-theme/index.js','/packages/lcap-echarts-line@2.2.0/dist-theme/index.js','/packages/lcap-you-data@0.1.8/dist-theme/index.js','/packages/lcap-report@0.0.15/dist-theme/index.js','/packages/lcap-echarts-pie@2.2.0/dist-theme/index.js','/packages/lcap-echarts-bar@2.2.0/dist-theme/index.js','/packages/lcap-login@1.2.2/dist-theme/index.js','/packages/extension/print_block_sdk@0.1.0/dist-theme/index.js','/packages/extension/cw_office_sdk@0.1.0/dist-theme/index.js','/bundle.34aa6e31.min.js']);
        LazyLoad.css(['/packages/cloud-ui.vusion@0.18.17/dist-theme/index.css','/packages/lcap-pc-template@0.8.6/cloudAdminDesigner.css','/packages/lcap-printPage@0.1.1/dist-theme/index.css','/packages/countdown@0.1.1/dist-theme/index.css','/packages/lcap-you-data@0.1.8/dist-theme/index.css']);
    }

    
    if(window.ICESTARK && window.ICESTARK.root) {
        Object.assign(window.ICESTARK, {
            appEnter({ container, customProps  }) {
                window.LcapMicro = window.LcapMicro || {};
                Object.assign(window.LcapMicro, {});
            
                if(window.LcapMicro.noAuthUrl && !window.LcapMicro.noAuthFn)
                    window.LcapMicro.noAuthFn = () => {
                        location.href = window.LcapMicro.noAuthUrl;
                    };
            
                if(window.LcapMicro.loginUrl && !window.LcapMicro.loginFn)
                    window.LcapMicro.loginFn = () => {
                        location.href = window.LcapMicro.loginUrl;
                    };

                if(window.LcapMicro.notFoundUrl && !window.LcapMicro.notFoundFn)
                    window.LcapMicro.notFoundFn = () => {
                        location.href = window.LcapMicro.notFoundUrl;
                    };
                
                // 兼容 ICESTARK 旧集成方式
                if(!window.LcapMicro.loginFn)
                    window.LcapMicro.loginFn = window.ICESTARK.loginFn;
                if(!window.LcapMicro.routePrefix)
                    window.LcapMicro.routePrefix = window.ICESTARK.basename;
                if(!window.LcapMicro.proxyPrefix)
                    window.LcapMicro.proxyPrefix = window.ICESTARK.proxyPrefix;

                window.LcapMicro.container = container; 
                window.LcapMicro.props = customProps;
                loadAssets();
            },
            appLeave({ container }) {
                container.innerHTML = null;
                if (window.appVM) {
                    window.appVM.$destroy();
                }
                document.querySelectorAll('script.lazyload').forEach((ele) => {
                    ele.active = false;
                });
            },
        });
    } else
        loadAssets();

})()
