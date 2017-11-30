/**
 * Created by tidhar on 11/30/17.
 */
import jenkins.model.Jenkins

def outputDirectory = "/tmp/downloadedPlugins"
def jenkinsPubliRepoUrl = "https://repo.jenkins-ci.org/public"

Jenkins.instance.getPluginManager().getPlugins().each{
    attributes = it.manifest.getMainAttributes()
    groupPath = attributes.getValue('Group-Id').replace(".", "/")
    artifactPath = attributes.getValue('Short-Name').replace(".", "/")
    version = attributes.getValue('Plugin-Version')
    cmd = "curl ${jenkinsPubliRepoUrl}/"
    println cmd

}
