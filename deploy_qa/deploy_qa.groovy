void call(){

echo "Starting Deployment"
stage("Deploy_QA"){
    node{
        steps{
              /*mail to: 'venkataramana.thalari@cummins.com',
              subject: "Job '${env.JOB_NAME}' (${env.BUILD_NUMBER}) is waiting for input",
              body: "Please go to ${env.BUILD_URL}console and verify the build"*/
              input "Deploy to Production?"
	      //Deployment Script
	}
    }
}
}
