from flask import Flask

app = Flask(__name__)

@app.route("/")
def index():
    return "index"

app.run(host="192.168.0.12",port=5000)