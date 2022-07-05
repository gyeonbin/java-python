# A very simple Flask Hello World app for you to get started with...

from flask import Flask,render_template

app = Flask(__name__,template_folder="templates")

@app.route('/')
def hello_world():
    num = 10
    myst = "DB read"
    if num == 10:
        result="num is higher than 10"
    return render_template('index.html',num=num,myst=myst,result=result)

@app.route('/aa')
def aa():
    return"aa"

@app.route('/bb')
def bb():
    return"bb"

@app.route('/cc')
def cc():
    return"cc"
