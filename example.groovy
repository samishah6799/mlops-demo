def deploy(String branch_name) {
  if (branch_name == "PROD") {
    println "Deploying to Production."
  } else if (branch_name == "TEST") {
    println "Deploying to Test."
  } else {
    println "Deploying to Dev."
  }
}

def build() {
  println "Building."
  sh 'pip3 install -r requirements.txt'
}

def test() {
  println "Test."
  sh '/Users/shehryarsohail-nu/anaconda3/envs/cvlab/bin/python test.py'
}
  
return this
