def gitDownload(repo)
{
     git "https://github.com/IntelliqDevops/${repo}.git"

}

def buildArtifact()
{
   sh 'mvn package'

}

def deployTomcat(ip,context)
{
     sh "scp /var/lib/jenkins/workspace/${JOB_NAME}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}
def runSelenium()
{
    sh "java -jar /var/lib/jenkins/workspace/${JOB_NAME}/testing.jar"

}





