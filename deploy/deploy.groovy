void call(){

echo "Starting Deployment"
stage("Deploy"){
    node{
        sleep(5)
	//"c:\Program Files (x86)\IIS\Microsoft Web Deploy V3\msdeploy.exe" -verb:sync -source:package=dancing.zip -dest:auto,computerName=https://192.168.205.10    
    }
}
echo "Auto deployment done"	
}
