#!/usr/bin/env python3

#!/usr/bin/python3

print("Content-type: text/html\n\n")
print("<html><body>")
print("<h2>Form Submitted using CGI</h2>")

import cgi
form = cgi.FieldStorage()
name = form.getvalue("name")

print(f"<p>Hello, {name}!</p>")
print("</body></html>")
