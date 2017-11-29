Jenkins.instance.getPluginManager().getPlugins().each{
  attributes = it.manifest.getMainAttributes()
  print " compile group: '${attributes.getValue('Group-Id')}', "
  print "name: '${attributes.getValue('Short-Name')}', "
  println "version: '${attributes.getValue('Plugin-Version')}'"
}
