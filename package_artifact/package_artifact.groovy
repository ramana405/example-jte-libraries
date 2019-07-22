void call(){
echo "Starting Package Stage"
stage("Package"){
       node{
              echo "packaging the code is in progress.."
              properties([
  	              parameters([
                            string(name: 'Solution_file', defaultValue: 'undefined'),
                            string(name: 'Project_Name1', defaultValue: 'undefined')
  	              ])
              ])
              bat "\"${tool 'MSBuild'}\" ${params.Solution_file} /T:Clean;Build;package /p:Configuration=Release /p:OutputPath=obj\\Release /p:PrecompileBeforePublish=true /p:PackageAsSingleFile=true"
              bat "rename C:\\Users\\venkataramana.t\\.jenkins\\workspace\\${env.JOB_NAME}\\${params.Project_Name}\\obj\\Release\\Package\\${params.Project_Name}.zip ${params.Project_Name}-${env.BUILD_NUMBER}.zip"
       }
}
echo "Ending Package Stage"      
}
