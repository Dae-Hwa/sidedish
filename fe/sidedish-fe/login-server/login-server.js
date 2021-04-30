const path = require('path');
const express = require('express');
const app = express();
const fetch = require('node-fetch');
const cors = require('cors');
const morgan = require('morgan');

app.use(cors());
app.use(morgan('combined'));
app.use(express.urlencoded({ extended: false }));
app.use(express.json());

const CLIENT_ID = 'd198fc93f1e4fa6b16c8';
const CLIENT_SECRET = 'b65c3e22599f923fde15104b3943a264cdb97be1';

app.get('/', (req, res) => {
  res.redirect(`https://github.com/login/oauth/authorize?client_id=${CLIENT_ID}`);
});

app.get('/github-oauth2-login', (req, res) => {
  const body = {
    client_id: CLIENT_ID,
    client_secret: CLIENT_SECRET,
    code: req.query.code
  };

  fetch(`https://github.com/login/oauth/access_token`, {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
      'Accept': 'application/json'
    },
    body: JSON.stringify(body)
  })
  .then(_res => _res.json())
  .then(json => {
    at = json['access_token'];
    res.json(json);
  })
  .catch(err => res.status(500).json({ message: err.message }));
});

app.listen(3030, console.log('login server listening on port 3030'));
