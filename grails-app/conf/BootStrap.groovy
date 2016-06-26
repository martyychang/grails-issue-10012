class BootStrap {

    def init = {
        application.mainContext.eventTriggeringInterceptor.datastores.each { k, datastore ->
            applicationContext.addApplicationListener new MyPersistenceListener(datastore)
        }
    }
    def destroy = {
    }
}
