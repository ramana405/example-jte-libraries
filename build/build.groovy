void call() {
echo "starting msbuild"
stage('build') {
       node {
              echo "Code build is in progress" 
              input id: 'Abc', message: 'Enter the solution file name?', ok: 'Continue', parameters: [string(defaultValue: 'DancingGoat.sln', description: '', name: 'Solution', trim: false)]
              echo "${params.build_file}"
              echo "${env.JOB_NAME}"
              //bat '"C:\\ProgramData\\chocolatey\\lib\\NuGet.CommandLine\\tools\\nuget.exe" restore DancingGoat.sln'
              //bat "\"${tool 'MSBuild'}\" DancingGoat.sln /p:Configuration=Release /p:Platform=\"Any CPU\" /P:DeployOnBuild=true"
       }
  } 
echo "ending msbuild"
}
