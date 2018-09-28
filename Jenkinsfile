pipeline{
	agent any
	tools {
   		 maven 'M3'
  	}
	stages{
		stage('--------clean-------'){
			steps{
				sh "mvn clean"
			}

		}
		stage('--------test----------'){
			steps{
				sh "mvn test"
			}
		}
		stage('--------package-------'){
			steps{
				sh "mvn package"
			}
		}
		stage(build and push'){
			steps{
			sh 'mvn clean install'
			/* generer à partir de pilipe syntax pour le deployement sur cloud foundry*/
			pushToCloudFoundry cloudSpace: 'test-space', credentialsId: 'zongo', organization: 'test-org', target: 'api.run.pivotal.io'
	}
	}
}
