let localStream;
let remoteStream;
let peerConnection;

const stunServer = {
     iceServers: [
          {
               urls: ['stun:stun1.1.google.com:19320', 'stun:stun2.1.google.com:19320']
          }
     ],
}

const initStream = async () => {
     localStream = await navigator.mediaDevices.getUserMedia({ video: true, audio: false });

     document.getElementById('user-1').srcObject = localStream;
}

let createOffer = async () => {
     peerConnection = new RTCPeerConnection(stunServer)

     remoteStream = new MediaStream()
     document.getElementById('user-2').srcObject = remoteStream;

     localStream.getTracks().forEach((track) => {
          peerConnection.addTrack(track, localStream)
     })

     peerConnection.ontrack = async (e) => {
          e.streams[0].getTracks().forEach((track) => {
               remoteStream.addTrack(track)
          })
     }

     peerConnection.onicecandidate = async (event) => {
          if (event.candidate) {
               document.getElementById('offer-sdp').value = JSON.stringify(peerConnection.localDescription);
          }
     }

     const offer = await peerConnection.createOffer();
     await peerConnection.setLocalDescription(offer);
     document.getElementById('offer-sdp').value = JSON.stringify(offer);
}

const createAnswer = async () => {
     peerConnection = new RTCPeerConnection(stunServer)

     remoteStream = new MediaStream()
     document.getElementById('user-2').srcObject = remoteStream;

     localStream.getTracks().forEach((track) => {
          peerConnection.addTrack(track, localStream)
     })

     peerConnection.ontrack = async (e) => {
          e.streams[0].getTracks().forEach((track) => {
               remoteStream.addTrack(track)
          })
     }

     peerConnection.onicecandidate = async (event) => {
          if (event.candidate) {
               document.getElementById('answer-sdp').value = JSON.stringify(peerConnection.localDescription);
          }
     }

     let offer = document.getElementById('offer-sdp').value
     offer = await JSON.parse(offer)
     await peerConnection.setRemoteDescription(offer);

     let answer = await peerConnection.createAnswer(offer);
     await peerConnection.setLocalDescription(answer);

     document.getElementById('answer-sdp').innerHTML = JSON.stringify(answer)

}


const addAnswer = async () => {
     let offer = document.getElementById('answer-sdp').value
     offer = await JSON.parse(offer)
     await peerConnection.setRemoteDescription(offer);
}

document.getElementById('create-offer').addEventListener('click', createOffer);
document.getElementById('create-answer').addEventListener('click', createAnswer);
document.getElementById('add-answer').addEventListener('click', addAnswer);
initStream();
