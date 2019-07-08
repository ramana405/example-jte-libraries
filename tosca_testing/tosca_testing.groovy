void call(){
echo 'Tosca testing is started..'
stage('Tosca_Test'){
    node {
            echo "Tosca testing is under progress.."
             sleep(5)
       }
}
echo 'Tosca testing is ended..'
}
