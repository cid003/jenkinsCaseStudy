pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                withMaven {
                    sh "mvn test"
                }
            }
           // steps {
           //     sh 'mvn test'
           // }
        }
    }
}
