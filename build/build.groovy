//import static Constants.*
void call() {
echo "starting msbuild"
//static final MYCONSTANT
       
stage('build') {
       node {
              echo "Code build is in progress"
              properties([
  	              parameters([
  		              string(name: 'Solution_file', defaultValue: 'undefined'),
                            string(name: 'Project_Name', defaultValue: 'undefined')
  	              ])
              ])
              //MYCONSTANT = "${params.Solution_file}"    
              println "####Printing parameter:"
              echo "mybranch = ${params.Solution_file}"
              echo "${env.BUILD_URL}"
              echo "${env.JOB_NAME}////name of job"
              echo "${env.JOB_BASE_NAME}////base name of job"
             // bat "\"C:\\ProgramData\\chocolatey\\lib\\NuGet.CommandLine\\tools\\nuget.exe\" restore ${params.Solution_file}"
              //bat "\"${tool 'MSBuild'}\" ${params.Solution_file} /T:Clean;Build /p:Configuration=Release /p:PrecompileBeforePublish=true /p:PackageAsSingleFile=true"
              //bat "\"${tool 'MSBuild'}\" ${params.Solution_file} /T:Clean;Build;package /p:Configuration=Release /p:OutputPath=obj\\Release /p:PrecompileBeforePublish=true /p:PackageAsSingleFile=true"       
       }
  }    
echo "ending msbuild"
}
