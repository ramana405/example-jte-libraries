void call(){
echo "Starting Static Code Analysis"       
stage('SCA_Sonar'){
       node{
            echo "Static code Analysis is in progress.."
            sleep(5)  
          /*bat '"C:\\ProgramData\\chocolatey\\bin\\SonarScanner.MSBuild.exe" begin /k:DancingGoat'
        	bat '"C:\\Program Files (x86)\\Microsoft Visual Studio\\2019\\Community\\MSBuild\\Current\\Bin\\MSBuild.exe" DancingGoat.sln /t:Rebuild'
        	bat '"C:\\ProgramData\\chocolatey\\bin\\SonarScanner.MSBuild.exe" end'*/
       }
} 
echo "Ending Static Code Analysis"
}
