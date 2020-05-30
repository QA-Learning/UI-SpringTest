pipeline {
   agent any

   stages {
      stage('checkout') {
         steps {
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/swati-kalra/juiceshop']]])
         }
      }
      stage('Maven installation') {
         steps {
             sh 'mvn clean test'
        }
      }
   }
}