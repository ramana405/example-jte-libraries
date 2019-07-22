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
                            string(name: 'Project_Name1', defaultValue: 'undefined')
  	              ])
              ])
              bat "\"C:\\ProgramData\\chocolatey\\lib\\NuGet.CommandLine\\tools\\nuget.exe\" restore ${params.Solution_file}"
              bat "\"${tool 'MSBuild'}\" ${params.Solution_file} /T:Clean;Build /p:Configuration=Release /p:PrecompileBeforePublish=true /p:PackageAsSingleFile=true"           
       }
  }    
echo "ending msbuild"
}
