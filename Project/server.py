from flask import Flask,render_template

app = Flask(__name__,template_folder="templates",static_folder='static')

@app.route("/")
def index():
    return render_template("index.html")

@app.route("/boardlist")
def boardlist():
    return render_template("board/list.html")

app.run(debug=True, port=80)