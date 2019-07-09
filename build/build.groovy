import static Constants.*
void call() {
echo "starting msbuild"
static final MYCONSTANT
       
stage('build') {
       node {
              echo "Code build is in progress"
              properties([
  	              parameters([
  		              string(name: 'Solution_file', defaultValue: 'undefined')
  	              ])
              ])
              ${MYCONSTANT} = "${params.Solution_file}"    
              println "####Printing parameter:"
              echo "mybranch = ${params.Solution_file}"
              echo "${env.JOB_URL}"
              //bat "\"C:\\ProgramData\\chocolatey\\lib\\NuGet.CommandLine\\tools\\nuget.exe\" restore ${params.Solution_file}"
              //bat "\"${tool 'MSBuild'}\" ${params.Solution_file} /T:Clean;Build /p:Configuration=Release /p:PrecompileBeforePublish=true /p:PackageAsSingleFile=true"
              //bat "\"${tool 'MSBuild'}\" ${params.Solution_file} /T:Clean;Build;package /p:Configuration=Release /p:OutputPath=obj\\Release /p:PrecompileBeforePublish=true /p:PackageAsSingleFile=true"       
       }
  }    
echo "ending msbuild"
}
