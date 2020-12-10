pipeline {
    agent any
    stages {
        stage('Test') {
            withMaven {
                sh "mvn test"
            }
           // steps {
           //     sh 'mvn test'
           // }
        }
    }
}
