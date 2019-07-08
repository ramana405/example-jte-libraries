void call(){
echo "Starting Package Stage"
stage("Package"){
       node{
              bat "\"${tool 'MSBuild'}\" DancingGoat.sln  /p:DeployOnBuild=true /p:Configuration=Release /p:Platform=\"Any CPU\"  /p:ProductVersion=1.0.0.${env.BUILD_NUMBER}"
              bat "rename C:\\Users\\venkataramana.t\\.jenkins\\workspace\\JenkinsTemplateEngineDemo_master\\DancingGoat\\obj\\Release\\Package\\DancingGoat.zip DancingGoat-${env.BUILD_NUMBER}.zip"
       }
}
echo "Ending Package Stage"      
}
