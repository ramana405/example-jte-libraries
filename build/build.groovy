void call() {
echo "starting msbuild"
stage('build') {
       node {
              echo "Code build is in progress" 
              //bat '"C:\\ProgramData\\chocolatey\\lib\\NuGet.CommandLine\\tools\\nuget.exe" restore DancingGoat.sln'
              //bat "\"${tool 'MSBuild'}\" DancingGoat.sln /p:Configuration=Release /p:Platform=\"Any CPU\" /P:DeployOnBuild=true"
       }
  } 
echo "ending msbuild"
}
