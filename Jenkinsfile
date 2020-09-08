pipeline {
	agent {
		dockerfile {
			label "docker"
		}
	}

	stages {
		stage("Build") {
			steps {
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
