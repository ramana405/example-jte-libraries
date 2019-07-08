void call(){
echo "Starting Unit Test"
stage("Unit_Test"){
       node{
	  echo 'Unit testing is in progress'     
	  sleep(10)
          //bat returnStatus: true, script: "\dotnet.exe\" test \"${workspace}/DancingGoat.sln\" --logger \"trx;LogFileName=unit_tests.xml\" --no-build"
	  //step([$class: 'MSTestPublisher', testResultsFile:"**/*.trx", failOnError: true, keepLongStdio: true])*/
       }       
} 
echo "Ending Unit Test"
}
