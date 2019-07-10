//import static Constants.*
void call(){
//load "build/build.groovy"
echo "Starting Static Code Analysis"       
stage('SCA_Sonar'){
       node{
            echo "Static code Analysis is in progress.."
              //echo "${MYCONSTANT}"
            properties([
  	              parameters([
  		              string(name: 'Solution_file', defaultValue: 'undefined'),
                            string(name: 'Project_Name', defaultValue: 'undefined')
  	              ])
              ])
            echo "${params.Solution_file}" 
            echo "${params.Project_Name}"  
            //sleep(5)  
            bat "\"C:\\ProgramData\\chocolatey\\bin\\SonarScanner.MSBuild.exe\" begin /k:${params.Project_Name}"
            bat "\"C:\\Program Files (x86)\\Microsoft Visual Studio\\2019\\Community\\MSBuild\\Current\\Bin\\MSBuild.exe\" ${params.Solution_file} /t:Rebuild"
            bat "\"C:\\ProgramData\\chocolatey\\bin\\SonarScanner.MSBuild.exe\" end"
       }
} 
echo "Ending Static Code Analysis"
}
