pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                withMaven(maven: 'M3') {
                    sh "mvn test"
                }
            }
        }
    }
}
