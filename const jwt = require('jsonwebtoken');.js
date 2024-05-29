const jwt = require('jsonwebtoken');
const secretKey = 'secret';

// Generate JWT token
const token = jwt.sign({ userId: 123 }, secretKey, { expiresIn: '1h' });

// Verify JWT token
jwt.verify(token, secretKey, (err, decoded) => {
    if (err) {
        console.error('Invalid token');
    } else {
        console.log('Decoded token:', decoded);
    }
});
