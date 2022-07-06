from flask import Flask,render_template,request
from f03 import Result


app = Flask(__name__,template_folder="templates")

@app.route("/")
def index():
    result=Result(request.args.get("num1"),request.args.get("num2"))
    
    # for i in range(num1,num2+1):
    #     result +=i



    return render_template("ex01.html",result=result)
    


app.run(debug=True,host="127.0.0.1",port=5000)