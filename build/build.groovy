void call() {
echo "starting msbuild"
stage('build') {
       node {
              echo "Code build is in progress" 
              input id: 'Abc', message: 'Enter the solution file name?', ok: 'Continue', parameters: [string(defaultValue: 'DancingGoat.sln', description: '', name: 'Solution', trim: false)]
              properties([[$class: 'ParametersDefinitionProperty', parameterDefinitions: [[$class: 'StringParameterDefinition', name: 'myparam', defaultValue: 'default value']]]])
              echo "received ${binding.hasVariable('myparam') ? myparam : 'undefined'}" 
              echo "${params.Solution}"
              echo "${env.JOB_URL}"
              //bat '"C:\\ProgramData\\chocolatey\\lib\\NuGet.CommandLine\\tools\\nuget.exe" restore DancingGoat.sln'
              //bat "\"${tool 'MSBuild'}\" DancingGoat.sln /p:Configuration=Release /p:Platform=\"Any CPU\" /P:DeployOnBuild=true"
       }
  } 
echo "ending msbuild"
}
