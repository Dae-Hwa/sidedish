import firebase from 'firebase'

const firebaseConfig = {
    apiKey: "AIzaSyCjPy34uF6g0tmqNIq7r2cZvGYQqH3z18E",
    authDomain: "fir-test-9adc6.firebaseapp.com",
    projectId: "fir-test-9adc6",
    storageBucket: "fir-test-9adc6.appspot.com",
    messagingSenderId: "1000939307493",
    appId: "1:1000939307493:web:05c9fe7ef3a10f33fb2f0c"
};

firebase.initializeApp(firebaseConfig);
firebase.analytics();

export default firebase;