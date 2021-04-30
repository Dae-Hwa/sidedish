import firebase from "../config/firebase-config";

const socialMediaAuth = async (provider) => {
  let result = "";
  await firebase
    .auth()
    .signInWithPopup(provider)
    .then((res) => {
      result = res;
      return res.user;
    })
    .catch((err) => {
      return err;
    });
  return result;
};

export default socialMediaAuth;
