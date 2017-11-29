Jenkins.instance.getPluginManager().getPlugins().each{
  attributes = it.manifest.getMainAttributes()
  println "<depndency>"
  println "    <groupId>${attributes.getValue('Group-Id')}</groupId>"
  println "    <artifactId>${attributes.getValue('Short-Name')}</artifactId>"
  println "    <version>${attributes.getValue('Plugin-Version')}</version>"
  println "</depndency>"
}
