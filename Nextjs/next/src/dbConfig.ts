import mongoose from 'mongoose'
export async function connect() {
     try {
          mongoose.connect(process.env.MONGO_URL!,);
          const connection = mongoose.connection;

          connection.on('connected', () => {
               console.log("mongo db connected succesfully!");
               process.exit();
          })
     } catch (error) {
          console.log("error from mongoose: ", error);
     }
}