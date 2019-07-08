void call(){
echo "Starting Package Stage"
stage("Package"){
       node{
              
              bat "rename C:\\Users\\venkataramana.t\\.jenkins\\workspace\\JenkinsTemplateEngineDemo_master\\DancingGoat\\obj\\Release\\Package\\DancingGoat.zip DancingGoat-${env.BUILD_NUMBER}.zip"
       }
}
echo "Ending Package Stage"      
}
