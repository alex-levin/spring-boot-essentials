import React from 'react';
import axios from 'axios';

class User extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      users: []
    };
  }

  componentDidMount() {
    axios.get('/api/v1/person')
    .then(response => {
      this.setState({users: response.data});
    });
  }

  render() {
    return (
      <div style={{
        display: "flex",
        width: "50%"
      }}>
        <ul>
          {this.state.users.map(user => {
            return <li key={user.UUID}>{user.name} {user.age}</li>;
          })}
        </ul>
      </div>
    
    );
  }
}

export default User;
