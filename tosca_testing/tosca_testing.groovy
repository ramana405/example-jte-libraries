void call(){
echo 'Tosca testing is started..'
stage('Tosca_Test'){
    node {
             sleep(5)
       }
}
echo 'Tosca testing is ended..'
}
