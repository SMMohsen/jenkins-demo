pipeline {

  agent any 
  
  stages {
  
  stage("Build") {
      steps {
      
      echo 'building app ..'
     sh "./mvnw clean install"
      
      }
  }
    
     stage("Test") {
      steps {
      
        echo "testing app .. ${BRANCH_NAME}"
      
      }
  }
  
  stage("Deploy") {
      steps {
      
      echo 'deploying app ..'
      
      }
  }
  
  }

}
