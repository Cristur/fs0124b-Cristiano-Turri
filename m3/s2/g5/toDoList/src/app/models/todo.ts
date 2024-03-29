import { iUsers } from "./users"

export interface iTodo {
  id: number
  todo: string
  completed: boolean
  userId: number
  user?:iUsers
}
