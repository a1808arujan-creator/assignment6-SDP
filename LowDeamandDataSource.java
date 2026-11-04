package kz.aitu.registration.strategy.section.data;
public class LowDemandDataSource
        implements DemandDataSource {

            @Override
            public int getCurrentDemand () {
                return 40;
            }
        }