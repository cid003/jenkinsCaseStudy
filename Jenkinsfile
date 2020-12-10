pipeline {
    agent any
    stages {
        stage('Test') {
            tools {
                jdk 'JDK9'
            }
            steps {
                withMaven(maven: 'M3') {
                    sh "mvn test"
                }
            }
        }
    }
}
