pipeline {
	agent {
		dockerfile {
			label "docker"
		}
	}

	stages {
		stage("Build") {
			steps {
				sh "ssh -V"
				sh "mvn -version"
				sh "mvn clean install"
			}
		}
	}
	
	post {
		always {
			cleanWs()
		}
	}
}
