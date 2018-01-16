@Grab(group='org.jsoup', module='jsoup', version='1.7.2')
import org.jsoup.Jsoup;
def url = "https://wiki.jenkins.io/display/JENKINS/Blue+Ocean+Plugin";
def document = Jsoup.connect(url).get();
def externalLinks = document.select(".external-link")
println externalLinks[0].attributes['href']

//check if contains plugins.jenkins.io

//open plugins.jenkins.io
//find github.com link
