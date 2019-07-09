void call() {
echo "starting msbuild"
stage('build') {
       node {
              echo "Code build is in progress"
              properties([
  	              parameters([
  		              string(name: 'Solution_file', defaultValue: 'undefined')
  	              ])
              ])
              println "####Printing parameter:"
              echo "mybranch = ${params.Solution_file}"
              echo "${env.JOB_URL}"
              bat '"C:\\ProgramData\\chocolatey\\lib\\NuGet.CommandLine\\tools\\nuget.exe" restore ${params.Solution_file}'
              bat "\"${tool 'MSBuild'}\" ${params.Solution_file} /p:Configuration=Release /p:Platform=\"Any CPU\" /P:DeployOnBuild=true"
       }
  } 
echo "ending msbuild"
}
