let USER;
let TEST_URL = "https://h3rb9c0ugl.execute-api.ap-northeast-2.amazonaws.com/develop/baminchan/best"
let SERVER_URL = 'http://3.36.66.115';

const Global = {
  setServerUrl: (serverUrl) => { SERVER_URL = serverUrl },
  getServerUrl: () => SERVER_URL,
  TEST_URL: TEST_URL,
  SERVER_URL: SERVER_URL,
}

export default Global;