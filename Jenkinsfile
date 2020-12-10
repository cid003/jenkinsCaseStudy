pipeline {
    agent any
    tools {
        maven 'M3'
    }
    stages {
        stage('Test') {
            steps {
                withMaven {
                    sh "mvn test"
                }
            }
        }
    }
}
