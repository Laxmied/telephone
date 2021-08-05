# telephone
1. http://localhost:8080/telephone/webapi/numberresource/numbers

Response:
[
   "0420920310",
   "0420820310",
   "0320920310",
   "0320820310",
   "0220920310",
   "0220820310",
   "0520920310",
   "0520820310"
]



2. http://localhost:8080/telephone/webapi/numberresource/numbersbyid
Header 
id - Sangeeta

Response:
{"value": {
   "custId": "Sangeeta",
   "teleNumbers":    [
      "0420920310",
      "0420820310"
   ]
}}

3. http://localhost:8080//telephone/webapi/numberresource/activate
Header
id - Sangeeta
num - 0889762342

Response:
"Success"

