Jenkins.instance.getPluginManager().getPlugins().each{ plugin ->
    plugin it.url
}
