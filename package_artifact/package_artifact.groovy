void call(){
echo "Starting Package Stage"
stage("Package"){
       node{
              echo "packaging the code is in progress.."
              //"\"${tool 'MSBuild'}\" DancingGoat.sln /p:Configuration=Release /p:Platform=\"Any CPU\" /P:DeployOnBuild=true /p:ProductVersion=1.0.${env.BUILD_NUMBER}"
              //bat "rename C:\\Users\\venkataramana.t\\.jenkins\\workspace\\JenkinsTemplateEngineDemo_master\\DancingGoat\\obj\\Release\\Package\\DancingGoat.zip DancingGoat-${env.BUILD_NUMBER}.zip"
       }
}
echo "Ending Package Stage"      
}
