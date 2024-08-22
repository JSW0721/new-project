//Create

fetch("https://eduapi.weniv.co.kr/158/blog/1")
  .then((response) => response.json())
  .then((json) => console.log(json))
  .catch((error) => console.error(error));

//READ
fetch("https://eduapi.weniv.co.kr/158/blog", {
  method: "POST",
  headers: {
    "Content-Type": "application/json",
  },
  body: JSON.stringify({
    title: "test 158",
    content: "test 158",
  }),
})
  .then((response) => response.json())
  .then((json) => console.log(json))
  .catch((error) => console.error(error));

//Update
fetch("https://eduapi.weniv.co.kr/158/blog/1", {
  method: "PUT",
  headers: {
    "Content-Type": "application/json",
  },
  body: JSON.stringify({
    title: "lorem",
    content: "lorem ipsun",
  }),
})
  .then((response) => response.json())
  .then((json) => console.log(json))
  .catch((error) => console.error(error));


//Delete
fetch("https://eduapi.weniv.co.kr/158/blog/1", {
  method: "DELETE",
  headers: {
    "Content-Type": "application/json",
  },
  body: JSON.stringify({
    title: "lorem",
    content: "lorem ipsun",
  }),
})
  .then((response) => response.json())
  .then((json) => console.log(json))
  .catch((error) => console.error(error));
